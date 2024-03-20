describe('Testes da Aplicação de Agenda de Contatos', () => {
    beforeEach(() => {
      cy.visit('https://agenda-contatos-react.vercel.app/')
    })
  
    it('Deve incluir um novo contato', () => {
      cy.get('[data-testid=novo-contato]').click()
      cy.get('[data-testid=input-nome]').type('Novo Contato')
      cy.get('[data-testid=input-email]').type('novo@contato.com')
      cy.get('[data-testid=botao-salvar]').click()
      cy.contains('Novo Contato')
      cy.contains('novo@contato.com')
    })
  
    it('Deve alterar um contato existente', () => {
      cy.contains('Nome do Contato a Ser Alterado').parent().find('[data-testid=botao-editar]').click()
      cy.get('[data-testid=input-nome]').clear().type('Contato Alterado')
      cy.get('[data-testid=input-email]').clear().type('contato@alterado.com')
      cy.get('[data-testid=botao-salvar]').click()
      cy.contains('Contato Alterado')
      cy.contains('contato@alterado.com')
    })
  
    it('Deve remover um contato existente', () => {
      cy.contains('Nome do Contato a Ser Removido').parent().find('[data-testid=botao-remover]').click()
      cy.contains('Nome do Contato a Ser Removido').should('not.exist')
    })
  })
  