<template>
  <div class="hello">
    <h1>1. 기본</h1>
    <div v-for="(name, idx) in names" v-bind:key="`for1${idx}`"> {{name}} 님</div>

    <h1>2. div 태그로 그룹핑 : div 태그가 흔적으로 남음</h1>
    <div v-for="(name, idx) in names" v-bind:key="`for2${idx}`"> {{name}}님</div> <!-- key 값은 고유 값이기 때문에 text를 붙여줌-->

    <h1>3. template 태그로 그룹핑 : template 태그가 흔적으로 안남음</h1>
    <template v-for="(name, idx) in names">
      <span v-bind:key="`for3${idx}`"> {{name}}님</span>
      <br v-bind:key="`br${idx}`">
    </template>
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
      names:['홍길동','이순신','유관순']
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
