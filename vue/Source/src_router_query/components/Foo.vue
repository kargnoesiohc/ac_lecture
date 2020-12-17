<template>
  <div class="hello">
    <h1>Foo</h1>
    {{$route.params.id}}<br>
    id:{{id}}<br>
  </div>
</template>

<script>
export default {
  name: 'Foo',
  props: {
    id:String,
  },

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
