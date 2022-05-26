import { ITarefa } from '../../../types/ITarefa';
import style from './iten.module.scss';

interface Props {
    item: ITarefa,
    selecionarTarefa(tarefaSelecionada: ITarefa): void
}

export default function Iten({ item, selecionarTarefa }: Props) {
    return (
        <li className={`${style.item} ${item.selecionado ? style.itemSelecionado : ''} ${item.completado ? style.itemCompletado : ''}`} 
        onClick={() => !item.completado && selecionarTarefa(item)}  >
            <h3>{item.tarefa}</h3>
            <span>{item.tempo}</span>
            {
                item.completado && <span className={style.concluido} aria-label="tarefa completada"></span>
            }
        </li >
    );
}

