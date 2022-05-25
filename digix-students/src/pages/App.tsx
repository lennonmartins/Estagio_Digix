
import Form from '../components/Form';
import List from '../components/List';
import style from  './App.module.scss';
import Cronometro from '../components/Cronometro';
import { useState } from 'react';
import { ITarefa } from '../types/ITarefa';

function App() {
  const [tarefas, setTarefas] = useState<ITarefa[]>([]);
  const [selecionado, setSelecionado] = useState<ITarefa>();
  function selecionarTarefa(tarefaSelecionada: ITarefa){
    setSelecionado(tarefaSelecionada);
    setTarefas(tarefasanteriores => tarefasanteriores.map(tarefa => ({
      ...tarefa,
      selecionado: tarefa.id === tarefaSelecionada.id
    })));
  };

  return (
    <div className= {style.AppStyle}>
      <Form setTarefas = {setTarefas}/>
      <Cronometro/>
      <List tarefas={tarefas}
      selecionarTarefa= {selecionarTarefa}/>
    </div>
  );
}

export default App;
  