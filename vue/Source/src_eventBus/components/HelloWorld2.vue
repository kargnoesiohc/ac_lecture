<template>
  <div class="hello">
    <h1>HelloWorld2</h1>
    <input type="text" v-bind:value="receive"/>
  </div>
</template>

<script>
import eventBus from "./EventBus";
export default {
  name: 'HelloWorld2',
  data:function() {
    return {
      receive: "호출 전",
    }
  },
  //eventBus.$on을 이용하여 처리할 이벤트 함수 등록
  created() {
    eventBus.$on("xyz", this.handleEvent); //이벤트 함수 등록
  },
  methods: {
    handleEvent: function (x, y) {
      this.receive = `수신 완료 : ${x}\t${y}`;
    }
  }

}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
