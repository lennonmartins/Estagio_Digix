import { DataGrid, GridColDef } from '@mui/x-data-grid';
import Container from '@mui/material/Container';
import Box from '@mui/material/Box';
import IColaborador from '../types/IColaborador';
import axios from 'axios';
import { useState } from 'react';


const columns: GridColDef[] = [
  { field: '_id', headerName: 'ID', width: 150 },
  { field: 'nome', headerName: 'Nome', width: 200 },
];

export default function App() {
  const [colaboradores, setColaboradores] = useState([]);

  axios.get('http://127.0.0.1:8000/login/obter_colaboradores/')
    .then(resposta => {
      setColaboradores(resposta.data.colaboradores);
    })
    .catch(erro => {
      console.log(erro);
    });

  return (
    <Container maxWidth="sm">
      <Box
        sx={{
          width: '100%',
          height: 300
        }}
      >
        <DataGrid
          rows={colaboradores}
          columns={columns}
          pageSize={5}
          autoHeight
          rowsPerPageOptions={[5]}
          disableSelectionOnClick={true}
        />
      </Box>
    </Container>
  );
}

