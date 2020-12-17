<template>
  <div id="app">
    <HelloWorld mesg="Welcome to Your Vue.js App"/>
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
    return {mesg: "Appcomponent"}
  },
  beforeCreate: function(){
    console.log('app.beforeCreate()')
  },
  created: function(){
    console.log("app.created()")
  },
  beforeMount: function(){
    console.log('app.beforeMount()')
  },
  mounted: function(){
    console.log("app.mounted", this.mesg);
    this.mesg = "AppcompnentUpdate"
  },

  updated: function(){
    console.log("app.updated()")
  },
  beforeDestroy: function(){
    console.log("app.beforeDestroy()")
  },
  destroyed: function(){
    console.log("app.destroy()")
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
