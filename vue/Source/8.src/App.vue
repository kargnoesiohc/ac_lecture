<template>
  <div id="app">
    data x: {{x}}, data y: {{y}}<br>
    <HelloWorld username="홍길동" v-bind:age="20" my-address="서울"/>
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
    return { x: "홍길동", y: "40", z: [10,20,30], k:{a:'kong',b:30}, p: new Person("aaa",20)}
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
ㅇㅇㅇㅇㅇ}
</style>
