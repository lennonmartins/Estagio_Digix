import { Box } from '@mui/material';
import { DataGrid, GridColDef } from '@mui/x-data-grid';
import axios from 'axios';
import { useState, useEffect } from 'react';

export default function DataGridColaborador() {

  const columns: GridColDef[] = [
    { field: 'id', headerName: 'ID', width: 150 },
    { field: 'nome', headerName: 'Nome', width: 200 },
  ];

  const [colaboradores, setColaboradores] = useState([]);

  useEffect(() => {
    axios.get('http://127.0.0.1:8000/login/obter_colaboradores/')
      .then(resposta => {
        setColaboradores(resposta.data.colaboradores);
      })
      .catch(erro => {
        console.log(erro);
      });

  }, []);

  return (
    <Box
      sx={{
        margintTop: 100,
        width: '100%',
        height: 300
      }}
    >
      <h2 >Lista de Colaboradores</h2>
      <DataGrid
        rows={colaboradores}
        columns={columns}
        pageSize={5}
        autoHeight
        rowsPerPageOptions={[5]}
        disableSelectionOnClick={true}
        editMode={'row'}
      />
    </Box>

  );
}
