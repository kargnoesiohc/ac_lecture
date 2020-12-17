<template>
  <div id="app">
    <HelloWorld msg="자식: HelloWorld"/>
    <Happy msg ="자식: Happy"/>
  </div>
</template>

<script>
import HelloWorld from "@/components/HelloWorld";
import Happy from "@/components/Happy";
export default {
  name: 'App',
  components: {
    HelloWorld,
    Happy
  }
}
</script>

<style scoped>

</style>
