import { ITarefa } from '../../types/ITarefa';
import Iten from './Iten';
import style from './List.module.scss';

interface Props{
    tarefas: ITarefa[],
    selecionarTarefa(selecionarTarefa:ITarefa): void,
    ativo: boolean | undefined
    
}

function Lista({tarefas, selecionarTarefa, ativo}: Props) {
   
    return (

        <aside className={style.listaTarefa}>
            <h2>Estuda do dia</h2>
            <ul>
                {tarefas.map((iten) => (
                    <Iten
                        ativo ={ativo}
                        key={iten.id}
                        item = {iten}
                        selecionarTarefa={selecionarTarefa}
                        
                    />
                ))}
            </ul>
        </aside>
    );
}
export default Lista;