const form = document.getElementById('form-deposito');

// function comparar()
// {
//     let campoa = document.getElementById('campo-a');
//     let campob = document.getElementById('campo-b');

//     if (campob.value > campoa.value)
//     {
//         message.innerHTML += `<p>Correto, B é maior que A</p>`
//     }
//     else if (campob.value == campoa.value)
//     {
//         message.innerHTML += `<p>A e B são iguais</p>`
//     }
//     else 
//     {
//         message.innerHTML += `<p>Errado, B é menor que A</p>`
//     }
// }

form.addEventListener('submit', function(e)
{
    e.preventDefault();

    let campoa = document.getElementById('campo-a');
    let campob = document.getElementById('campo-b');

    if (campob.value > campoa.value)
    {
        message.innerHTML = `<p>Correto, B é maior que A</p>`
    }
    else if (campob.value == campoa.value)
    {
        message.innerHTML = `<p>A e B são iguais</p>`
    }
    else 
    {
        message.innerHTML = `<p>Errado, B é menor que A</p>`
    }

    campoa.value = null;
    campob.value = null;
})
