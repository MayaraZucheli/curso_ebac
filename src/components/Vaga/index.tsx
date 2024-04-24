import React from 'react'
import styled from 'styled-components'

// Estilos para o componente Vaga
const StyledVaga = styled.li`
  border: 1px solid var(--cor-principal);
  background-color: var(--cor-secundaria);
  color: var(--cor-principal);
  padding: 16px;
  transition: all ease 0.3s;
  border-radius: 8px;

  &:hover {
    background-color: var(--cor-principal);
    color: var(--cor-secundaria);
  }
`

const Titulo = styled.h3`
  font-weight: bold;
  margin-bottom: 16px;
`

const LinkDetalhes = styled.a`
  border-color: var(--cor-secundaria);
  background-color: var(--cor-principal);
  color: var(--cor-secundaria);
  display: inline-block;
  padding: 8px 16px;
  text-decoration: none;
  margin-top: 16px;
  font-weight: bold;
  font-size: 14px;
  border-radius: 8px;
  text-align: center;

  @media (max-width: 768px) {
    display: block;
  }

  &:hover {
    border-color: var(--cor-principal);
    background-color: var(--cor-secundaria);
    color: var(--cor-principal);
  }
`

type Props = {
  titulo: string
  localizacao: string
  nivel: string
  modalidade: string
  salarioMin: number
  salarioMax: number
  requisitos: string[]
}

const Vaga = ({
  titulo,
  localizacao,
  nivel,
  modalidade,
  salarioMin,
  salarioMax,
  requisitos
}: Props) => (
  <StyledVaga>
    <Titulo>{titulo}</Titulo>
    <p>Localização: {localizacao}</p>
    <p>Senioridade: {nivel}</p>
    <p>Tipo de contratação: {modalidade}</p>
    <p>
      Salário: {salarioMin} - {salarioMax}
    </p>
    <p>Requisitos: {requisitos.join(', ')}</p>
    <LinkDetalhes href="#">Ver detalhes e candidatar-se</LinkDetalhes>
  </StyledVaga>
)

export default Vaga
