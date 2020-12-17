<template>
  <div id="hello">
    username: {{username}}<br>
    age: {{age}}, age+100: {{age+100}}<br>
    myAddress: {{myAddress}}<br>
    isMarried: {{isMarried}}<br>
    isMarried2: {{isMarried2}}<br>
    phones: {{phones[0]}}<br>
    author: {{author.name}}, {{author.company}}
  </div>
</template>

<script>
export default {
  name: "HelloWorld",
  props: {
    username: String,
    age:Number,
    myAddress: String,
    isMarried: Boolean,
    isMarried2: Boolean,
    phones: Array,
    author: Object
  }
}
</script>

<style scoped>

</style>
