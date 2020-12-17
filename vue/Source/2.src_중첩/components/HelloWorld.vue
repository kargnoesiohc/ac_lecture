<template>
  <div id="hello">
    <h1>{{msg}}</h1>
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    msg: String // 변수명: type
  }
}
</script>

<style scoped>

</style>
