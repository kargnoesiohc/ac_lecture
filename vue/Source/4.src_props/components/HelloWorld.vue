<template>
  <div class="hello">
    <h1>{{ username }}}</h1>
    나이: {{age+1}}<br>
    주소: {{myAddress}}<br>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: ['username','age','myAddress']
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
