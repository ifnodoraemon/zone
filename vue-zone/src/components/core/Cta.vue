<template>
    <v-btn
            class="mr-0"
            fab
            fixed
            bottom
            right
            title="Go To Top"
            color="secondary"
            @click="$vuetify.goTo(0)"
    >
        <v-icon>mdi-chevron-up</v-icon>
    </v-btn>
</template>

<script>
    export default {
        name: "Cta"
    }
</script>

<style scoped>

</style>
