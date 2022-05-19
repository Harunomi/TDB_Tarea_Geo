<template>
  <div class="container">
    <h1>Regiones</h1>
    <ul class="item-list">
      <li v-for="(region, index) in regions" :key="index">
        {{ region.nom_reg }}
      </li>
    </ul>
    <div v-if="regions.length == 0" class="empty-list">
      <em>No hay regiones activas en el momento.</em>
    </div>
  </div>
</template>

<script>
export default {
  //Función que contiene los datos del componente
  data() {
    return {
      //Lista de regiones a mostrar
      regions: [],
    };
  },
  methods: {
    //Función asíncrona para consultar los datos
    getData: async function () {
      try {
        let response = await this.$axios.get("http://localhost:3000/regions");
        this.regions = response.data;
        console.log(response);
      } catch (error) {
        console.log("error", error);
      }
    },
  },
  //Función que se ejecuta al cargar el componente
  created: function () {
    this.getData();
  },
};
</script>
<style>
</style>