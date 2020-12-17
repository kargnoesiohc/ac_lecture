<template>
  <div id="app">
    <HelloWorld username="홍길동"
                v-bind:age="20"
                my-address="서울"
                isMarried
                v-bind:isMarried2="false"
                v-bind:phones="[100,200,300]"
                v-bind:author="{name:'Veronica', company: 'Veridian Dynamuic'}"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

export default {
  name: 'App',
  components: {
    HelloWorld
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
