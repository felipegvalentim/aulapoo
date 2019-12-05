var app = new Vue({
    el: '#app',
    data: {
    title: 'Aula de Front-End',
    message: 'Hello Vue!',
    aula: 'Front-End com Vue.JS',
    states: [{"id":2,"nome":"Paraná"},{"id":3,"nome":"Rio de Janeiro"},{"id":4,"nome":"Bahia"}],
    stateName: '',
},
    methods: {
        setStateName(event){
            this.stateName = event.target.value;
        },

        addStateList(){
                const id = this.states.length;
                this.states.push({
                    id: id,
                    nome : this.stateName
                });
        },

        changeInputValue(event){
            console.log(event)
            this.message = event.target.value;
        },

        getStates(){
            //this.states = ['Paraná', 'São Paulo']
        }
        },

        created(){
            console.log('Criou o componente')
            this.getStates()
        },
        
})