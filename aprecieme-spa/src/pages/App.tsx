import Container from '@mui/material/Container';
import Lista from '../pages/components/DataGridColaborador';
import FormCadastro from './components/FormCadastro';


export default function App() {
  
  return (
    <Container maxWidth="sm">
      <FormCadastro/>
      <Lista/>
    </Container>
  );
}

