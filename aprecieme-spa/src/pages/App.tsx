import Container from '@mui/material/Container';
import Router from '../routes';
import Lista from '../pages/components/DataGridColaborador';
import FormCadastro from './components/FormCadastro';


export default function App() {
  return (
    <Container maxWidth="lg">
      <Router/>
    </Container>
  );
}

