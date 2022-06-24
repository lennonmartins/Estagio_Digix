import { EventOutlined, SaveOutlined } from "@mui/icons-material";
import Box from "@mui/material/Box";
import Button from "@mui/material/Button";
import Grid from "@mui/material/Grid";
import TextField from "@mui/material/TextField";
import axios from "axios";
import React, { useState } from "react";
import IColaborador from "../../../types/IColaborador";
import { IMaskInput } from 'react-imask';
import NumberFormat, { InputAttributes } from 'react-number-format';

const token = "Basic dXN1YXJpb2xvY2FsOnNlbmhhbG9jYWw="
const data = {
    colaboradores: [] as IColaborador[]
}

interface CustomProps {
    onChange: (event: { target: { name: string; value: string } }) => void;
    name: string;
}

const TextMaskCustom = React.forwardRef<HTMLElement, CustomProps>(
    function TextMaskCustom(props, ref) {
        const { onChange, ...other } = props;
        return (
            <IMaskInput
                {...other}
                mask="000.000.000-00"
                definitions={{
                    '#': /[1-11]/,
                }}

                onAccept={(value: any) => onChange({ target: { name: props.name, value } })}
                overwrite
            />
        );
    },
);


interface State {
    textmask: string;
    numberformat: string;
}

export default function FormCadastro() {

    const [values, setValues] = React.useState<State>({
        textmask: '000.000.000-00',
        numberformat: '000.000.000-00',
    });

    const handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
        setValues({
            ...values,
            [event.target.name]: event.target.value,
        });
    };

    const [value, setValue] = React.useState<Date | null>(new Date());

    const [colaborador, setColaborador] = useState<IColaborador>({
        id: 0,
        nome: "",
        cpf: "",
        data_de_nascimento: "",
        usuario_id_do_chat: ""

    });

    const cadastrar = (evento: React.FormEvent<HTMLFormElement>) => {
        evento.preventDefault();
        data.colaboradores.push(colaborador)

        axios.post("http://127.0.0.1:8000/login/colaborador/",
            JSON.stringify(data),
            {
                headers: {
                    "Authorization": token
                }
            })

            .then(resposta => {
                console.log(resposta)
            })
            .catch(erro => {
                console.log(erro)
            })
            ;

    }

    return (

        <Box sx={{ flexGrow: 1 }}>
            <h2 >Cadastro de Colaboradores</h2>
            <form onSubmit={cadastrar} method="POST">
                <Grid container spacing={2}>
                    <Grid item xs={8}>
                        <TextField
                            fullWidth
                            id="outlined-basic"
                            label="Nome"
                            variant="outlined"
                            placeholder="Nome Completo"
                            autoFocus={true}
                            value={colaborador.nome}
                            onChange={evento => setColaborador({
                                ...colaborador, nome: evento.target.value
                            })}
                        />
                    </Grid>
                    <Grid item xs={4}>
                        <TextField
                            InputProps={{
                                inputComponent: TextMaskCustom as any
                            }}
                            id="formatted-text-mask-input"
                            label="CPF*"
                            variant="outlined"
                            placeholder="CPF*"
                            value={colaborador.cpf}
                            name="textmask"
                            onChange={evento => setColaborador({
                                ...colaborador, cpf: evento.target.value
                            })}
                        />

                    </Grid>

                    <Grid item xs={4}>
                        <TextField
                            id="outlined-basic"
                            label="Data de Nascimento*"
                            variant="outlined"
                            value={colaborador.data_de_nascimento}
                            onChange={evento => setColaborador({
                                ...colaborador, data_de_nascimento: evento.target.value
                            })}
                        />
                    </Grid>
                    <Grid item xs={8}>
                        <TextField
                            fullWidth
                            required
                            id="outlined-basic"
                            label="ID chat"
                            variant="outlined"
                            placeholder="ID chat discord"
                            helperText="Veja aqui como buscar seu ID no discord "
                            value={colaborador.usuario_id_do_chat}
                            onChange={evento => setColaborador({
                                ...colaborador, usuario_id_do_chat: evento.target.value
                            })}
                        />
                    </Grid>

                    <Grid item xs={8}>
                        <Button
                            color="secondary"
                            type="submit"
                            variant="contained"
                            endIcon={<SaveOutlined />}>
                            Cadastrar
                        </Button>
                    </Grid>
                </Grid>
            </form>


        </Box >
    );

}