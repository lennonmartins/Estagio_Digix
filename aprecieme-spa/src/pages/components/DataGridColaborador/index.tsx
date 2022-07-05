import { Box, Grid } from '@mui/material';
import { DataGrid, GridActionsCellItem,  GridColumns, GridRowId } from '@mui/x-data-grid';
import axios from 'axios';
import { useState, useEffect } from 'react';
import Button from '@mui/material/Button';
import { SaveOutlined } from '@mui/icons-material';
import EditIcon from '@mui/icons-material/Edit';
import DeleteIcon from '@mui/icons-material/DeleteOutlined';
import { useNavigate } from 'react-router-dom';

export default function DataGridColaborador() {
  
  const [colaboradores, setColaboradores] = useState([]);
  const navegar = useNavigate();
  const editarColaborador = (id: GridRowId) => () => {
    navegar(`/cadastro/${id}`);
  };


  const columns: GridColumns = [
    { field: 'id', headerName: 'ID', width: 150 },
    { field: 'nome', headerName: 'Nome', width: 200 },
    { field: 'opcoes', headerName: 'Editar', width: 75, editable: false, hideable: false, sortable: false, filterable: false, type: 'actions',
      getActions: ({ id }) => {   
        return[
          <GridActionsCellItem
            key={id}
            icon={<EditIcon />}
            label="Editar"
            className="textPrimary"
            onClick={editarColaborador(id)}
            color="inherit"
          />,
          // 
        ];    },
    },
  ];

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
    <>
      <Box
        sx={{
          margintTop: 100,
          width: '100%',
          height: '100%',
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
      {/* <div>
        <Button
          color="secondary"
          type="button"
          variant="contained"
          href= '/cadastro'
          endIcon={<SaveOutlined />}>
                    Cadastrar
        </Button>
      </div> */}
    </>
  );
}
