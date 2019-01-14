sdp_image_repository = "http://0.0.0.0:5000"
sdp_image_repository_credential = "sdp-docker-registry"
application_image_repository = "0.0.0.0:5000"
application_image_repository_credential = "sdp-docker-registry"

libraries{
  sdp
  github_enterprise
  docker
}

keywords{
  merge = true
}

stages{
  merge = true
    prod_ready{
        static_code_analysis
        build
    }
}
