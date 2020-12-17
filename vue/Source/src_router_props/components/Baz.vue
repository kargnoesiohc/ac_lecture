<template>
  <div class="hello">
    <h1>Baz</h1>
    {{pw}}
  </div>
</template>

<script>
export default {
  name: "Baz",
  props: {
    pw: String,
  },
}
</script>

<style scoped>

</style>
