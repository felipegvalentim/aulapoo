
const botaoEnviar = document.getElementById("botao-enviar");

botaoEnviar.addEventListener('click', () => {
    const inputCep = document.getElementById("input-cep");
    const cepValue = inputCep.value;
    fetch(`https://viacep.com.br/ws/${cepValue}/json/`)
    .then(content => content.json())
    .then(data => {
        console.log(data);
    })
});