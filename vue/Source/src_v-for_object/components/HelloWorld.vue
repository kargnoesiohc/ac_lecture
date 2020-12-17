<template>
  <div class="hello">
    <h1> index없이 사용</h1>
      <ul>
        <li v-for="(value, key) in person" :key="key">
          {{key}}:{{value}}
        </li>
      </ul>
      <ul>
        <li v-for="(value, key, i) in person" v-bind:key="key">
          {{i+1}}:{{key}}:{{value}}
        </li>
      </ul>
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
      person: {
        username: '홍길동',
        age: 20,
        address: '서울'
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
