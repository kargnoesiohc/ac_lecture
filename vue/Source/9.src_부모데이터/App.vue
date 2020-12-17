<template>
  <div id="app">
    이름: {{x}} <br>
    나이: {{y}}
    <HelloWorld :username = "x" :age ="y" v-bind:arr="z"/>
  </div>
</template>
<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data: function(){
    return {x: '홍길동', y: 40, z: [10,20,30]}
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
