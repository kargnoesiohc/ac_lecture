<template>
  <div class="hello">
    <h3>자식에서 부모로 이벤트 발생</h3>
    <button v-on:click="x">부모에게 요청</button>
    <button v-on:click="x2">부모에게 요청</button>

  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data:function(){
    return{

    }
  },
  //이벤트 핸들러 등록
  methods: {
    x:function() {
      console.log("자식 x의 this : ", this);
      this.$emit("xyz");//자식에서 부모로 전달 될 이벤트 명
    },
    x2:function() {
      console.log("자식 x의 this : ", this);
      this.$emit("xyz2", 100, "홍길동"); //자식에서 전달 될 이벤트 명, 데이터 넘김
    },
  },
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
