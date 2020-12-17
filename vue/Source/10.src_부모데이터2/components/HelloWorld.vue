<template>
  <div class="hello">
    <h1>자식 컴포넌트</h1>
    username: {{username}}, age: {{age}}, arr: {{arr}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    username: String,
    age: Number,
    arr: Array
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
