$(document).ready(function() {
    document.querySelector('body button').addEventListener('click');
})

$('body button').click(function() {
})

$('form').on('submit', function(e) {
    e.preventDefault();
    const addTarefa = $('#nome-da-tarefa').val();
    $(`<li> ${addTarefa}</li>`).appendTo('ul');
    $(novoItem).appendTo('ul').click();
});
