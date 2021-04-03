# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rc_dynamics_api provides an API for easy handling of the dynamic-state data       streams provided by Roboception's stereo camera with self-localization.       See http://rc-visard.com        Dynamic-state estimates of the rc_visard relate to its self-localization and       ego-motion estimation. These states refer to rc_visard's current pose,       velocity, or acceleration and are published on demand via several data streams.       For a complete list and descriptions of these dynamics states and the       respective data streams please refer to rc_visard's user manual."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "http://rc-visard.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_CN = "rc_dynamics_api"
ROS_BPN = "rc_dynamics_api"

ROS_BUILD_DEPENDS = " \
    curl \
    protobuf \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    catkin \
    curl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    curl \
    protobuf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_dynamics_api-release/archive/release/melodic/rc_dynamics_api/0.10.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rc_dynamics_api"
SRC_URI = "git://github.com/roboception-gbp/rc_dynamics_api-release;${ROS_BRANCH};protocol=https"
SRCREV = "371632e7aea627f9b93120399bc6194739344cc5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}