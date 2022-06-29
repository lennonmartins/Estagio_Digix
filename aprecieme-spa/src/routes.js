import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import DataGridColaborador from './pages/components/DataGridColaborador';
import FormCadastro from './pages/components/FormCadastro';
import token from './data/token.json';

export default function AprecieRouter(){
  return(
    <Router>
      <Routes>
        <Route path="/" element={<DataGridColaborador/>}/>
        <Route path="/cadastro" element={<FormCadastro token={token}/>}/>
      </Routes>
    </Router>
  );
}   