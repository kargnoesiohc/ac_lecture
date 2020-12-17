<template>
  <div class="hello">
    <h1>Baz</h1>
    넘어온 데이터 : {{id}}
  </div>
</template>

<script>
export default {
  name: "Baz",
  props: {
    id: String,
  },
}
</script>

<style scoped>

</style>
