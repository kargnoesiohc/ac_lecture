<template>
  <div class="hello">
    점수 : <input type="text" v-model.number="grade"> <!--number 사용-->
    <p v-if="grade > 90 ">A학점</p>
    <p v-else-if="grade > 80 ">B학점</p>
    <p v-else-if="grade > 70 ">C학점</p>
    <p v-else-if="grade > 60 ">D학점</p>
    <p v-else>F학점</p>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data: function(){
    return {
      grade:50,
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
