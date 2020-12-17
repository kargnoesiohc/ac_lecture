<template>
  <div id="hello">
    username: {{username}}, age: {{age}}, arr: {{arr}}
  </div>
</template>
s
<script>
export default {
  name: "HelloWorld",
  props: {
    // 부모에서 데이터 받기
    username: String,
    age: Number,
    arr: Array
  }
}
</script>

<style scoped>

</style>
