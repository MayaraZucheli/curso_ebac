import React from 'react'
import styled from 'styled-components'

const StyledHero = styled.div`
  background-image: url('https://cdn.pixabay.com/photo/2018/08/10/15/45/woman-3597101_1280.jpg');
  background-size: cover;
  height: 360px;
  width: 100%;
  position: relative;
  display: flex;
  align-items: center;

  &::before {
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: var(--cor-principal);
    content: '';
    opacity: 0.7;
  }

  h1 {
    position: relative;
    color: #eee;
    font-family: Gloock, serif;
    font-size: 48px;
    text-align: center;
  }

  @media (max-width: 768px) {
    height: auto;
    padding: 24px 0;

    h1 {
      font-size: 32px;
    }
  }
`

const Hero = () => {
  return (
    <StyledHero>
      <h1>As melhores vagas para tecnologia, design e artes visuais.</h1>
    </StyledHero>
  )
}

export default Hero
