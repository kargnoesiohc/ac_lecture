<template>
  <div class="hello">
    <select v-model="result">
      <option disabled selected>과일을 선택하세요</option>
      <option v-for="(value, key, i) in fruits" v-bind:key="i" v-bind:value="value"> {{i+1}}.{{key}} </option>
    </select><br>
    선택한 과일 : {{result}}
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
      fruits: {
        apple: '사과',
        banana: '바나나',
        melon: '멜론'
      },
      result: '', //선택한 과일 저장
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
