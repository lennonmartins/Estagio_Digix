import React from "react";
import { ITarefa } from "../../types/ITarefa";
import Button from "../Button";
import style from './Form.module.scss';

class   Form extends React.Component<{
    setTarefas: React.Dispatch<React.SetStateAction<ITarefa[]>>
    }> {
    state = {
        tarefa: "", 
        tempo: "00:00:00"
    }
    adcionarTarefa(evento: React.FormEvent<HTMLFormElement>) {
        evento.preventDefault();
        this.props.setTarefas(tarefasAntigas => [...tarefasAntigas, {...this.state}]);
       
    };
    render() {
        return (
            <form className={style.novaTarefa} onSubmit={this.adcionarTarefa.bind(this)}>
                <div className={style.inputContainer}>
                    <label htmlFor="tarefa">Adicione um novo estudo: </label>
                    <input
                        type="text"
                        name="tarefa"
                        id="tarefa"
                        placeholder="O que você quer estudar?" required
                        value={this.state.tarefa}
                        onChange={evento => this.setState({
                            ...this.state, tarefa: evento.target.value
                        })}
                    />
                </div>
                <div className={style.inputContainer}>
                    <label htmlFor="tempo">Tempo: </label>
                    <input
                        type="time"
                        step="1"
                        name="tempo"
                        id="tempo"
                        min="00:00:00"
                        max="01:30:00" required
                        value={this.state.tempo}
                        onChange={
                            evento => this.setState({
                                ...this.state, tempo: evento.target.value
                            })
                        }
                    />
                </div>
                <Button type="submit" >
                    Adicionar
                </Button>
            </form>
        )
    }
}

export default Form;