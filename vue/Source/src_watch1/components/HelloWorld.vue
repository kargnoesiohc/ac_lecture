<template>
  <div class="hello">
    <h3>watch</h3>
    값 : <input type="text" v-model="num"><br>
    변경된 값 : {{num}}
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
     num:10, //watch의 사용은 변수명과 함수명이 동일해야 함
    }
  },
  //1. 함수명과 data 변수명 동일
  //2. data 속성이 변경되면 method와 computed는 명시적으로 호출해야 하지만
  //watch는 함수명과 동일한 변수명의 값이 변하면 watch 호출
  watch: {
    num: function(newVal) {
      console.log(`watch함수 실행, ${this.num} \t ${newVal}`)
    }
  }
}
</script>
<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
