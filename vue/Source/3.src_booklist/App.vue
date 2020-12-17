<template>
  <div id="app">
    <BookList msg="도서목록"/>
  </div>
</template>

<script>
import BookList from "@/components/BookList";
export default {
  name: 'App',
  components: {
    BookList
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: left;
  color: #2c3e50;
  margin-top: 60px;
}
li{
  list-style: none;
}
ul{
  padding: 0;
}
</style>
