<template>
  <div id="app">
    이름: {{x}}, 나이: {{y}}
    <HelloWorld v-bind:[attributeName] = "x" v-bind:age = "y" :arr="z"/>
    <!--v-bind: username = "x" v-bind:age="y" :arr="z"-->
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data: function (){
    return {
      x: '강감찬',
      y: 20,
      z: [100,200,300],
      attributeName: "username" //속석명으로 사용 추가
    }
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
