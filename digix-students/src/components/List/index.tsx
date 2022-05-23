import style from './List.module.scss';
import Iten from './Iten';

function Lista() {
    const tarefas = [
        { tarefa: 'React', tempo: '02:00:00' },
        { tarefa: 'Javascript', tempo: '01:00:00' },
        { tarefa: 'Java', tempo: '00:30:00' }
    ];
    return (
        <aside className={style.listaTarefa}>
            <h2>Estuda do dia</h2>
            <ul>
                {tarefas.map((iten, index) => (
                    <Iten 
                    key = {index}
                    tarefa = {iten.tarefa}
                    tempo ={iten.tempo}
                    />
                ))}
            </ul>
        </aside>
    );
}
export default Lista;