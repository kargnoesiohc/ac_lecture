<template>
  <div id="app">
    <router-link :to="{name: 'Bar'}">Bar</router-link>
    <router-link :to="{name: 'Foo'}">Foo</router-link>
    <router-link :to="{name: 'Baz', params: {id: 'kkkk'}}">Baz</router-link><br>

    <router-view/>
<!--    라우팅 된 컴포넌트가 보여질 부분-->
  </div>
</template>

<script>
export default {
  name: 'App',
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
