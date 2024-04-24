import React, { useState } from 'react'
import FormVagas from '../../components/FormVagas'
import Vaga from '../../components/Vaga'
import styled from 'styled-components'

const StyledListaVagas = styled.div`
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  column-gap: 16px;
  row-gap: 16px;
  margin-top: 32px;

  @media (max-width: 768px) {
    grid-template-columns: 1fr;
  }
`

const ListaVagas = () => {
  const [filtro, setFiltro] = useState<string>('')

  // Array de vagas
  const vagas = [
    {
      id: 1,
      titulo: 'Desenvolvedor front-end',
      localizacao: 'remoto',
      nivel: 'junior',
      modalidade: 'clt',
      salarioMin: 3000,
      salarioMax: 4500,
      requisitos: ['HTML', 'CSS', 'JavaScript', 'jQuery']
    },
    {
      id: 2,
      titulo: 'Desenvolvedor NodeJS',
      localizacao: 'remoto',
      nivel: 'pleno',
      modalidade: 'pj',
      salarioMin: 5000,
      salarioMax: 6500,
      requisitos: ['Node.js', 'Express', 'MongoDB']
    },
    {
      id: 3,
      titulo: 'Desenvolvedor fullstack',
      localizacao: 'remoto',
      nivel: 'pleno',
      modalidade: 'pj',
      salarioMin: 4000,
      salarioMax: 6000,
      requisitos: ['HTML', 'CSS', 'JavaScript', 'Node.js', 'React', 'MongoDB']
    },
    {
      id: 4,
      titulo: 'Designer de interfaces',
      localizacao: 'remoto',
      nivel: 'junior',
      modalidade: 'clt',
      salarioMin: 4000,
      salarioMax: 5000,
      requisitos: ['Adobe XD', 'Figma', 'Photoshop']
    },
    {
      id: 5,
      titulo: 'Desenvolvedor front-end',
      localizacao: 'remoto',
      nivel: 'senior',
      modalidade: 'clt',
      salarioMin: 7000,
      salarioMax: 8000,
      requisitos: ['HTML', 'CSS', 'JavaScript', 'React', 'Vue.js', 'Angular']
    },
    {
      id: 6,
      titulo: 'Desenvolvedor front-end para projeto internacional',
      localizacao: 'remoto',
      nivel: 'senior',
      modalidade: 'pj',
      salarioMin: 12000,
      salarioMax: 15000,
      requisitos: ['HTML', 'CSS', 'JavaScript', 'React', 'Vue.js', 'Angular']
    },
    {
      id: 7,
      titulo: 'Desenvolvedor front-end',
      localizacao: 'São Paulo/SP',
      nivel: 'junior',
      modalidade: 'clt',
      salarioMin: 4000,
      salarioMax: 5000,
      requisitos: ['HTML', 'CSS', 'JavaScript', 'React', 'Redux', 'TypeScript']
    }
  ]

  const vagasFiltradas = vagas.filter((vaga) =>
    vaga.titulo.toLowerCase().includes(filtro.toLowerCase())
  )

  return (
    <StyledListaVagas>
      <FormVagas aoPesquisar={(termo: string) => setFiltro(termo)} />
      {vagasFiltradas.map((vaga) => (
        <Vaga
          key={vaga.id}
          titulo={vaga.titulo}
          localizacao={vaga.localizacao}
          nivel={vaga.nivel}
          modalidade={vaga.modalidade}
          salarioMin={vaga.salarioMin}
          salarioMax={vaga.salarioMax}
          requisitos={vaga.requisitos}
        />
      ))}
    </StyledListaVagas>
  )
}

export default ListaVagas
