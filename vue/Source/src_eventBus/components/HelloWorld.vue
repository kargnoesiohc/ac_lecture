<template>
  <div class="hello">
    <h3>이벤트 버스 실습</h3>
    <button v-on:click="x">HelloWorld2로 전달(이벤트로 전달)</button>
  </div>
</template>

<script>
import eventBus from "./EventBus";
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  methods: {
    x:function() {
      eventBus.$emit("xyz", 100, "홍길동");
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
