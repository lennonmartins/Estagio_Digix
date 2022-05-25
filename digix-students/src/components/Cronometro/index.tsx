import Button from "../Button";
import Relogio from "./Relogio";
import style from './cronometro.module.scss';
import { tempoParaSegundos } from "../../commom/utils/date";

export default function Cronometro() {
    console.log(`conversao`, tempoParaSegundos('1:00:00'))
    return (
        <div className={style.cronometro}>
            <p className={style.titulo}> Escolha um card e inicie o cronometro</p>

            <div className={style.relogioWrapper}>
                <Relogio />
            </div>
            <Button>
                Iniciar
            </Button>
        </div>

    );
} 