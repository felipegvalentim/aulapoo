var app = new Vue({
    el: '#app',
    data: {
    message: 'Hello Vue!',
    aula: 'Front-End com Vue.JS',
    states: []
},
    methods: {
        changeInputValue(event){
            console.log(event)
            this.message = event.target.value;
        },
        getStates(){
            fetch('https://rest-banco-api.herokuapp.com/estados')
            .then(content => content.json())
            .then(message => {
                
            })
            this.states = ['Paraná', 'São Paulo']
        }
    },
        created(){
            console.log('Criou o componente')
            this.getStates()

    }
})