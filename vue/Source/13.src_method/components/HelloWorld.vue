<template>
  <div class="hello">
    <h1>{{msg}}</h1>
    <h2>{{username}}, {{age}}</h2>
    sayEcho(): {{sayEcho()}} <br>
    info(): {{info()}}
    my(): {{my()}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data: function(){
    return {
      username: '홍길동',
      age: 20
    }
  },
  methods:{
    sayEcho: () => {
      return new Date().toString();
    },
    info: function () {
      return `${this.username} ${this.age}`
    },
    my: () => `my>>>>>>`
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
