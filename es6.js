
const alunos = [
    { nome: 'Mariana', nota: 8 },
    { nome: 'Mateus', nota: 5 },
    { nome: 'Felipe', nota: 4 },
    { nome: 'Miguel', nota: 7 },
    { nome: 'Regina', nota: 6 },
    { nome: 'Carol', nota: 2 }
  ];
  
  function alunosAprovados(arrayDeAlunos) {
    return arrayDeAlunos.filter(aluno => aluno.nota >= 6);
  }
  
  const alunosAprovadosArray = alunosAprovados(alunos);
  console.log('Alunos aprovados:', alunosAprovadosArray);
  