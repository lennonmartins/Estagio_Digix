import { ITarefa } from '../../../types/ITarefa';
import style from './iten.module.scss';

interface Props {
    item: ITarefa,
    selecionarTarefa(tarefaSelecionada: ITarefa): void,
    ativo: boolean | undefined
}

export default function Iten({ item, selecionarTarefa, ativo }: Props) {
    return (
        <li className={`${style.item} ${item.selecionado ? style.itemSelecionado : ''} ${item.completado ? style.itemCompletado : ''}`} 
        onClick={() => !ativo && !item.completado && selecionarTarefa(item)}  >
            <h3>{item.tarefa}</h3>
            <span>{item.tempo}</span>
            {
                item.completado && <span className={style.concluido} aria-label="tarefa completada"></span>
            }
        </li >
    );
}

