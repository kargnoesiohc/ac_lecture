<template>
  <div id="app">
    <HelloWorld v-on:xyz="y" v-on:xyz2="y2"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  methods: {
    y:function () {
      console.log("부모의 y 호출");
    },
    y2:function (v, v2) {
      console.log(`부모의 y2 호출 ${v}\t${v2}`);
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
