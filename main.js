class Animal {
    constructor(nome) {
      this.nome = nome;
    }
  
    fazerBarulho() {
      throw new Error('Método fazerBarulho deve ser implementado nas classes filhas');
    }
  }
  
  class Cachorro extends Animal {
    fazerBarulho() {
      return 'Au Au!';
    }
  }
  
  class Gato extends Animal {
    fazerBarulho() {
      return 'Miau!';
    }
  }
  
  const cachorro1 = new Cachorro('Chad');
  const gato1 = new Gato('Misha');
  const gato2 = new Gato('Dom');
  
  console.log(cachorro1.fazerBarulho());
  console.log(gato1.fazerBarulho());
  console.log(gato2.fazerBarulho()); 
  