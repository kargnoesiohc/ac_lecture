<template>
  <div class="hello">
    username: {{username}}, age: {{age}}, myAddress: {{myAddress}}
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    username: String,
    age: Number,
    myAddress: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
